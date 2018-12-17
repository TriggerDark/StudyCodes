$(document).ready(function () {
   $('#slideDown').click(function () {
       $('#content').slideDown(1000);
   });
   $('#slideUp').click(function () {
       $('#content').slideUp(1000);
   });
   $('#toggle').click(function () {
       $('#content').slideToggle(1000);
   });
});