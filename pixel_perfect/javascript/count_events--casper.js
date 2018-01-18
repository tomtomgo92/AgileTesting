/* var casper = new require("casper").Casper(); */

casper.test.begin('Count Events Test', 1, function suite(test) {
    casper.start('https://www.tesla.com/fr_FR/events', function () {
        test.assertElementCount("div.event-static-map", 15, "Il y a 15 events");
    });
    casper.run(function () {
        test.done();
    });
});