var parameters = @;var in=parameters.getOrDefault(0,undefined);

var res = JUI.image("Image")(in);
if(res.type == "error"){
res = JUI.image("Image")(in.reader());
}
return res;
