var parameters = @;var cdf=parameters.getOrDefault(0,undefined);


var tf = JUI.control("TextField")();
tf.textProperty().bindBidirectional(cdf.getValue().get(0));
tf.onAction = ({||
var val = eval.ant(tf.getText());
if(val.type == "unknown"){
val = "{}";
}
cdf.getValue().get(1).set(val);
});
tf.focusedProperty().addListener({||
if(tf.isFocused()){
currentTextField = tf;
}
});
return SimpleObjectProperty(tf);
