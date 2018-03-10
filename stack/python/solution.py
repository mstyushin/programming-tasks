import sys


def is_balanced(string: str) -> bool:
    stack = []

    for char in string:
        if char in ('{', '[', '(', '<'):
            stack.append(char)
        elif char in ('}', ']', ')', '>'):
            if char == '}':
                if len(stack) == 0 or '{' != stack.pop():
                    return False
            if char == ')':
                if len(stack) == 0 or '(' != stack.pop():
                    return False
            if char == ']':
                if len(stack) == 0 or '[' != stack.pop():
                    return False
            if char == '>':
                if len(stack) == 0 or '<' != stack.pop():
                    return False
    return len(stack) == 0


if __name__ == '__main__':
    for line in sys.stdin:
        print(is_balanced(line))
