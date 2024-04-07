function addToCart(productName, price) {
    Swal.fire({
        title: 'Produto adicionado ao carrinho!',
        icon: 'success',
        showConfirmButton: false,
        timer: 1500
    });
    var cartItems = document.getElementById("cartItems");
    var listItem = document.createElement("li");
    listItem.textContent = productName + " - Preço: R$ " + price;
    cartItems.appendChild(listItem);

    // Atualizar o preço total
    updateTotalPrice();
}

function toggleCart() {
    var cart = document.getElementById("cart");
    cart.style.display = cart.style.display === "block" ? "none" : "block";
}

function sendWhatsAppMessage() {
    var cartItems = document.getElementById("cartItems").getElementsByTagName("li");
    var totalPrice = document.getElementById("totalPrice").textContent;
    var message = "Pedido via WhatsApp:\n";
    for (var i = 0; i < cartItems.length; i++) {
        message += cartItems[i].textContent + "\n";
    }
    message += "\nTotal: " + totalPrice;

    // Corrigir o formato do número de telefone para o Brasil
    var phoneNumber = "+5516981313200"; // Substitua pelo número de telefone correto

    // Criar o URL do WhatsApp com o número de telefone e a mensagem
    var whatsappURL = "https://wa.me/" + phoneNumber + "?text=" + encodeURIComponent(message);
    window.open(whatsappURL, "_blank");
}
