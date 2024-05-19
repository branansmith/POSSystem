import React from "react";
import "./NavBar.css";

const NavBar = () => {
  return (
    <nav class="nav">
      <h1>Collector Haven</h1>
      <ul>
        <li>
          <p>Employee Name</p>
        </li>
        <li>
          <button id="log-out-btn">Log Out</button>
        </li>
      </ul>
    </nav>
  );
};

export default NavBar;
