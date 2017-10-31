var parameters = @;var jSeries=parameters.getOrDefault(0,undefined);

var jData=parameters.getOrDefault(1,undefined);

var fx=parameters.getOrDefault(2,undefined);

var fy=parameters.getOrDefault(3,undefined);

var start=parameters.getOrDefault(4,undefined);

var stop=parameters.getOrDefault(5,undefined);

var name=parameters.getOrDefault(6,"");


var xData = fx.for(start,stop);
var yData = fy.for(start,stop);

var makeSeries = {|jSeries, jData, name, xd, yd|
var s = jSeries();
s.setName(name);
({|i| return s.getData().add(jData(xd[i], yd[i]));})
.for(0,xd.length()-1);
return s;
};

return makeSeries(jSeries,jData,name,xData,yData);
