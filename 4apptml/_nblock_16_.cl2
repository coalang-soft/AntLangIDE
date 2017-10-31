var parameters = @;var win=parameters.getOrDefault(0,undefined);


var g = gui();
var s = JUI.Scene(g);
if(s.type == "error"){
s = JUI.Scene(JUI.layout("Pane")([g]));
}
win.scene = s;
win.show();
