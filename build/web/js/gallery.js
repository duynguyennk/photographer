function updateImage(src) {
    var imageSlide = document.getElementById("imageShow");
    imageSlide.src = src;
}

var isSlide = false;
var interval = null;
var index = 0;

function slideImage() {
    var playBtn = document.getElementById("playButton");
    if (!isSlide) {
        playBtn.src = "image/icon_pause.png";
        var images = document.getElementsByClassName("imageThumb");
        interval = setInterval(e => {
            if (index === images.length) {
                index = 0;
            }
            var image = images[index++];
            updateImage(image.src);
        }, 500);
        isSlide = true;
    } else {
        clearInterval(interval);
        playBtn.src = "image/icon_play.png";
        isSlide = false;
    }
}



