
const books = [
    { id: 1, title: "The Great Gatsby", author: "F. Scott Fitzgerald" },
    { id: 2, title: "To Kill a Mockingbird", author: "Harper Lee" }
];

document.addEventListener("DOMContentLoaded", function () {
    const bookListUl = document.getElementById("book-list-ul");
    const cartItemsUl = document.getElementById("cart-items");
    const checkoutButton = document.getElementById("checkout-button");

   
    function displayAvailableBooks() {
        bookListUl.innerHTML = "";
        books.forEach((book) => {
            const li = document.createElement("li");
            li.textContent = `${book.title} by ${book.author}`;
            bookListUl.appendChild(li);
        });
    }

   
    function addToCart(book) {
        const li = document.createElement("li");
        li.textContent = `${book.title} by ${book.author}`;
        cartItemsUl.appendChild(li);
    }

    
    bookListUl.addEventListener("click", (event) => {
        if (event.target && event.target.nodeName === "LI") {
            const bookIndex = Array.from(bookListUl.children).indexOf(event.target);
            const selectedBook = books[bookIndex];
            addToCart(selectedBook);
        }
    });

   
    checkoutButton.addEventListener("click", () => {
        alert("Checkout functionality will be implemented here.");
    });

    
    displayAvailableBooks();
});
