currentTextField.requestFocus();
if(currentTextField.isFocused()){
currentTextField.insertText(currentTextField.getCaretPosition(), txt);
}