/* globals crel, moment, startInterval, fitText */

var $time = crel("div", { class: "time" });
var $date = crel("div", { class: "date" });

startInterval(function() {
  var time = moment().tz("Asia/Seoul");
  $time.innerHTML = time.format("h:mm:ssa");
  $date.innerHTML = time.format("dddd, MMMM D");
}, 1000);

document.body.appendChild($time);
document.body.appendChild($date);

fitText($time);
fitText($date, 1.8);
