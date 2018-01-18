module.exports = function (phantom) {
    phantom.viewportSize.height = document.body.offsetHeight;
    phantom.open(phantom.page.url);
}