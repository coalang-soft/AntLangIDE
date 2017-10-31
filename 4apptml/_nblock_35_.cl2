
if(chartTab.isSelected()){
println(table);
var chart = chartTab.getContent().getCenter();
println(chart);
chart.getData().clear();
for(0, table.getItems().size() - 1){
var code = table.getItems().get(@.0).get(0).getValue();
println(code);
var evaluated = eval.ant(code);
println(evaluated);
if(evaluated.type == "unknown"){
chart.getData().add(
XYSeries(
({|x| return x;}), evaluated, -100, 100,
code
)
);
}
}
}
