function showModal(title, price) {
    document.getElementById('modal-title').innerText = title;
    document.getElementById('modal-price').innerText = `Price: ${price}`;
    document.getElementById('modal').style.display = 'block';
    document.getElementById('modal-overlay').style.display = 'block';
}

function closeModal() {
    document.getElementById('modal').style.display = 'none';
    document.getElementById('modal-overlay').style.display = 'none';
}
