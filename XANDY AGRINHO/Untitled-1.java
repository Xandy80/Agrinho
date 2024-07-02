  <script>
        const gallery = document.querySelector('.gallery');
        const images = document.querySelectorAll('.gallery img');
        let currentIndex = 0;

        function nextSlide() {
            currentIndex = (currentIndex + 1) % images.length;
            updateGallery();
        }

        function prevSlide() {
            currentIndex = (currentIndex - 1 + images.length) % images.length;
            updateGallery();
        }

        function updateGallery() {
            const slideWidth = images[0].clientWidth;
            gallery.style.transform = `translateX(${-slideWidth * currentIndex}px)`;
        }
    </script>