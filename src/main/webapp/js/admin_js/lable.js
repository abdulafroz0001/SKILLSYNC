// Get the date input element and its label
const dateInput = document.getElementById("dob");
const dateLabel = document.querySelector('label[for="dob"]');
let labelVisible = false; // Flag to track if the label is visible

// Function to toggle the label's visibility
function toggleLabelVisibility() {
    dateLabel.hidden = !dateLabel.hidden;
    labelVisible = !labelVisible;
}

// Function to hide the label when the user clicks outside
function hideLabelOnClickOutside(event) {
    if (labelVisible && event.target !== dateInput) {
        dateLabel.hidden = true;
        labelVisible = false;
    }
}

// Add an event listener to toggle label visibility when clicking on the date input
dateInput.addEventListener("click", toggleLabelVisibility);

// Add a click event listener to the document body to hide the label when clicking outside
document.body.addEventListener("click", hideLabelOnClickOutside);
