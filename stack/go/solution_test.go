package main

import "testing"

func TestBalancedString(t *testing.T) {
	balancedString := "({(<>)})"

	if !IsBalanced(balancedString) {
		t.Error("Expected true, got ", false)
	}
}

func TestUnBalancedString(t *testing.T) {
	unbalancedString := "({())})<"

	if IsBalanced(unbalancedString) {
		t.Error("Expected false, got ", true)
	}
}
