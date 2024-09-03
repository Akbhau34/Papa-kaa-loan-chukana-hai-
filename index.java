document.addEventListener("DOMContentLoaded", () => {
    document.body.classList.add('fade-in');

    // Smooth page transitions
    document.querySelectorAll('a').forEach(link => {
        if (link.href.includes(window.location.origin)) {
            link.addEventListener('click', e => {
                e.preventDefault();
                document.body.classList.add('fade-out');
                setTimeout(() => {
                    window.location.href = link.href;
                }, 500);
            });
        }
    });

    // Cart functionality (Basic example)
    let cartCount = 0;
    document.querySelectorAll('.btn-primary').forEach(button => {
        button.addEventListener('click', () => {
            cartCount++;
            document.querySelector('.cart-count').textContent = cartCount;
        });
    });
});