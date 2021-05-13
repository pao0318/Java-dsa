static boolean ispar(String s)
{
Stack<character> stack = new Stack<character>();
for (char c : s.toCharArray()) {
if (c == '(')
stack.push(')');
else if (c == '{')
stack.push('}');
else if (c == '[')
stack.push(']');
else if (stack.isEmpty() || stack.pop() != c)
return false;
}
return stack.isEmpty();
}
