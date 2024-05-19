import React, { useState } from "react";
import "./LoginScreen.css";

function LoginScreen() {
  const [username, setUsername] = useState("");
  const [password, setPassword] = useState("");

  const handleUsernameChange = (event) => {
    setUsername(event.target.value);
  };

  const handlePasswordChange = (event) => {
    setPassword(event.target.value);
  };

  const handleSubmit = (event) => {
    event.preventDefault();

    console.log(`Submitted username: ${username}, password: ${password}`);
  };

  return (
    <>
      <div class="container" id="login-screen-container">
        <div class="header" id="login-screen-header">
          Collection Haven
        </div>

        <div class="container" id="credentials-container">
          <div class="text" id="employee-text">
            Employee ID
          </div>
          <div class="inputs" id="employee-id-input">
            <div class="input">
              <input type="text" />
            </div>
          </div>

          <div class="text" id="password-text">
            Password
          </div>
          <div class="inputs" id="password-input">
            <div class="input">
              <input type="password" />
            </div>
          </div>

          <div class="submit-container">
            <button id="log-in-button">Log In</button>
          </div>

          <a href="#" id="forgot-password-link">
            Forgot Password
          </a>
        </div>
      </div>
    </>
  );
}

export default LoginScreen;
