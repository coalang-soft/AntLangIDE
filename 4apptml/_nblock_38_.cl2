var parameters = @;var kind=parameters.getOrDefault(0,undefined);

var const=parameters.getOrDefault(1,undefined);

var info=parameters.getOrDefault(2,const);

var ctrl = JUI.control(kind)(info);
ctrl.onAction = insertText.bind(const);
return ctrl;
