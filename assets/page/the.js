/* globals crel, moment, startInterval */

var output = crel("div", { class: "output" });

startInterval(function() {
  output.innerHTML = moment().tz("Asia/Seoul").format("dddd, MMMM D, h:mm:ssa");
}, 1000);

document.body.appendChild(output);
