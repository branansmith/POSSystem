import React from "react";
import "./Cart.css";

const Cart = () => {
  return (
    <div class="container" id="cart-container">
      <ul class="list-group list-group flush" id="item-list">
        <li class="list-group-item">Test</li>
      </ul>
      <h2 id="subtotal">
        <span>Subtotal: {}</span>
      </h2>

      <h2 id="total">
        <span>Total: {}</span>
      </h2>
    </div>
  );
};

export default Cart;
