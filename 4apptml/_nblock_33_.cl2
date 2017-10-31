var parameters = @;var jSeries=parameters.getOrDefault(0,undefined);

var jData=parameters.getOrDefault(1,undefined);

var name=parameters.getOrDefault(2,undefined);

var xd=parameters.getOrDefault(3,undefined);

var yd=parameters.getOrDefault(4,undefined);


var s = jSeries();
s.setName(name);
({|i| return s.getData().add(jData(xd[i], yd[i]));})
.for(0,xd.length()-1);
return s;
