package main

import (
	"bufio"
	"errors"
	"fmt"
	"io"
	"os"
	"sync"
)

type StackChar struct {
	lock        sync.Mutex
	elementData []rune
}

func NewStack() *StackChar {
	return &StackChar{
		sync.Mutex{},
		make([]rune, 0),
	}
}

func (stack *StackChar) Push(b rune) {
	stack.lock.Lock()
	defer stack.lock.Unlock()

	stack.elementData = append(stack.elementData, b)
}

func (stack *StackChar) Pop() (rune, error) {
	stack.lock.Lock()
	defer stack.lock.Unlock()

	stackLength := len(stack.elementData)
	if stackLength == 0 {
		return 0, errors.New("Stack is empty")
	}

	res := stack.elementData[stackLength-1]
	stack.elementData = stack.elementData[:stackLength-1]
	return res, nil
}

func IsBalanced(s string) bool {
	stack := NewStack()
	res := true
	for _, char := range s {
		switch char {
		case '{', '[', '(', '<':
			stack.Push(char)
		case ')':
			curChar, err := stack.Pop()
			if curChar != '(' || err != nil {
				res = false
			}
		case '}':
			curChar, err := stack.Pop()
			if curChar != '{' || err != nil {
				res = false
			}
		case ']':
			curChar, err := stack.Pop()
			if curChar != '[' || err != nil {
				res = false
			}
		case '>':
			curChar, err := stack.Pop()
			if curChar != '<' || err != nil {
				res = false
			}
		default:
			continue
		}
	}
	return res
}

func main() {
	reader := bufio.NewReader(os.Stdin)
	var err error
	var s string
	for err != io.EOF {
		s, err = reader.ReadString('\n')
		if s != "" {
			fmt.Println(IsBalanced(s))
		}
	}
}
