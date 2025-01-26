document.getElementById("calculateBtn").addEventListener("click", function () {
    const value = parseFloat(document.getElementById("inputValue").value);
    const percentage = parseFloat(document.getElementById("percentageValue").value);
    const operation = document.getElementById("operation").value;
    let result;
  
    if (isNaN(value) || isNaN(percentage)) {
      alert("Please enter valid numbers.");
      return;
    }
  
    switch (operation) {
      case "calculatePercentage":
        result = (value * percentage) / 100;
        document.getElementById("result").innerHTML = `<p>Percentage of ${value} is ${result}</p>`;
        break;
      case "increasePercentage":
        result = value + (value * percentage) / 100;
        document.getElementById("result").innerHTML = `<p>${value} increased by ${percentage}% is ${result}</p>`;
        break;
      case "decreasePercentage":
        result = value - (value * percentage) / 100;
        document.getElementById("result").innerHTML = `<p>${value} decreased by ${percentage}% is ${result}</p>`;
        break;
      case "findWhole":
        result = (value * 100) / percentage;
        document.getElementById("result").innerHTML = `<p>Whole value for ${value} as ${percentage}% is ${result}</p>`;
        break;
      default:
        document.getElementById("result").innerHTML = "<p>Invalid Operation</p>";
    }
  });
  