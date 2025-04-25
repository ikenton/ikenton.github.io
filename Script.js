
  function togglePopup(){
    document.getElementById("popup-1").classList.toggle("active");
  }

  function chooseImage(imgElement){
    const src = imgElement.getAttribute('data-src');
    currentIndex = imageSources.indexOf(src);
    const popupImage = document.getElementById('popup-image');
    popupImage.setAttribute('src', src)
    togglePopup();
  }
  let currentIndex = 0;
  const imageSources = [];
  //populates image sources array with data-src attributes
  document.addEventListener('DOMContentLoaded', () => {
    const gridItems = document.querySelectorAll('.grid-item img');
    gridItems.forEach(item => {
        imageSources.push(item.getAttribute('data-src'));
    });
});
  function lastImage(index){
    currentIndex = (currentIndex - 1 + 21) % 21;
    updatePopupImage();
  }
  function nextImage(index){
    currentIndex = (currentIndex + 1) % 21;
    updatePopupImage();
  }

  function updatePopupImage(){
    const popupImage = document.getElementById('popup-image');
    
    // Update the src attribute with the new image source
    popupImage.setAttribute('src', imageSources[currentIndex]);
  }

  var websiteImages = ['images/Photos/before-about-page.png','images/Photos/before-coding-projects-1.png','images/Photos/before-coding-projects-2.png','images/Photos/before-resume-page.png'];
  var webIndex = 0;

  function updateWebImage(){
    const webImage = document.getElementById('web-image');
    webImage.setAttribute('src', websiteImages[webIndex]);
  }

  function prevWeb(index){
    webIndex = (webIndex - 1 + websiteImages.length) % websiteImages.length;
    updateWebImage();

  }
  function nextImage(index){
    webIndex = (webIndex + 1) % websiteImages.length;
    updateWebImage();
  }