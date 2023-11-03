
  // Get the form element
  const form = document.querySelector(".form");


  function validateNameField(input) {
    const regex = /^[A-Za-z\s]+$/; // Only allows letters and spaces
    return regex.test(input.value);
  }

  // Function to display a validation message
  function showValidationMessage(input, message) {
    const errorMessage = input.nextElementSibling;
    errorMessage.textContent = message;
    errorMessage.style.display = "block";
  }

  // Function to hide the validation message
  function hideValidationMessage(input) {
    const errorMessage = input.nextElementSibling;
    errorMessage.textContent = "";
    errorMessage.style.display = "none";
  }

  // Add an event listener for form submission
  form.addEventListener("submit", function (event) {
    let isValid = true;

    // Validate Full Name
    const fullNameInput = form.querySelector('input[name="fullname"]');
    if (!validateNameField(fullNameInput)) {
      showValidationMessage(fullNameInput, "contains only letters and spaces.");
      isValid = false;
    } else {
      hideValidationMessage(fullNameInput);
    }

    // Validate Department
    const departmentInput = form.querySelector('input[name="dept"]');
    if (!validateNameField(departmentInput)) {
      showValidationMessage(departmentInput, "contains only letters and spaces.");
      isValid = false;
    } else {
      hideValidationMessage(departmentInput);
    }

    // Validate Course
    const courseInput = form.querySelector('input[name="course"]');
    if (!validateNameField(courseInput)) {
      showValidationMessage(courseInput, "contains only letters and spaces.");
      isValid = false;
    } else {
      hideValidationMessage(courseInput);
    }

    // Validate Contact No using regex pattern
    const contactNoInput = form.querySelector('input[name="contactno"]');
    const contactNoPattern = /^[789][0-9]{9}$/;
    if (!contactNoPattern.test(contactNoInput.value)) {
      showValidationMessage(contactNoInput, "start with 7, 8, or 9 and be 10 digits long.");
      isValid = false;
    } else {
      hideValidationMessage(contactNoInput);
    }

    // Validate Email
    const emailInput = form.querySelector('input[name="email"]');
    const emailPattern = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/;
    if (!emailPattern.test(emailInput.value)) {
      showValidationMessage(emailInput, "Invalid email format.");
      isValid = false;
    } else {
      hideValidationMessage(emailInput);
    }

    if (!isValid) {
      event.preventDefault(); // Prevent form submission if there are validation errors
    }
    else
    {
		form.submit();
	}
  });

