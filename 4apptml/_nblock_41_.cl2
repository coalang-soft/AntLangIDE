
var val = eval.ant(tf.getText());
if(val.type == "unknown"){
val = "{}";
}
cdf.getValue().get(1).set(val);
