var parameters = @;var txt=parameters.getOrDefault(0,undefined);

if((currentTextField.type == "undefined")!){
currentTextField.requestFocus();
if(currentTextField.isFocused()){
currentTextField.insertText(currentTextField.getCaretPosition(), txt);
}
}
