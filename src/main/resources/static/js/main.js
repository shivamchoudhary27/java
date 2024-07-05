function togglePasswordVisibility() {
	var passwordInput = document.getElementById("password1");
	var passwordVisibilityIcon = document.querySelector(".p-viewer i");

	if (passwordInput.type === "password") {
		passwordInput.type = "text";
		passwordVisibilityIcon.classList.remove("fa-eye");
		passwordVisibilityIcon.classList.add("fa-eye-slash");
	} else {
		passwordInput.type = "password";
		passwordVisibilityIcon.classList.remove("fa-eye-slash");
		passwordVisibilityIcon.classList.add("fa-eye");
	}
}

// Password validation function
function validatePassword() {
	var passwordInput = document.getElementById("password1");
	var password = passwordInput.value;

	var regex = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*\W).{8,}$/;

	if (!regex.test(password)) {
		passwordInput
			.setCustomValidity("Password must be at least 8 characters long and contain at least one capital letter, one special character, and one digit.");
	} else {
		passwordInput.setCustomValidity("");
	}
}

function buttonsTimeout() {
	setTimeout(function() {
	 location.reload();
	}, 2000); // Redirect after 2 seconds

	clearTimeout(redirectTimeout);
}

function openNav() {
	document.getElementById("mySidenav").style.width = "250px";
}

function closeNav() {
	document.getElementById("mySidenav").style.width = "0";
}

$('.btnn').click(function() {
	$(this).toggleClass("click");
	$('.sidebar').toggleClass("show");
});

// $('.feat-btn').click(function () {
//     $('nav ul .feat-show').toggleClass("show");
//     $('nav ul .first').toggleClass("rotate");
// });

// $('.serv-btn').click(function () {
//     $('nav ul .serv-show').toggleClass("show1");
//     $('nav ul .second').toggleClass("rotate");
// });

$('nav ul li').click(function() {
	$(this).addClass("active").siblings().removeClass("active");
});

var createAllErrors = function() {
	var form = $(this), errorList = $("ul.errorMessages", form);

	var showAllErrorMessages = function() {
		errorList.empty();

		var invalidFields = form.find(":invalid").each(function(index, node) {

			// Find the field's corresponding label
			var label = $("label[for=" + node.id + "] "),
				// Opera incorrectly does not fill the validationMessage property.
				message = node.validationMessage || 'Invalid value.';

			errorList
				.show()
				.append("<li><span>" + label.html() + "</span> " + message + "</li>");
		});
	};

	// Support Safari
	form.on("submit", function(event) {
		if (this.checkValidity && !this.checkValidity()) {
			$(this).find(":invalid").first().focus();
			event.preventDefault();
		}
	});

	$("input[type=submit], button:not([type=button])", form)
		.on("click", showAllErrorMessages);

	$("input", form).on("keypress", function(event) {
		var type = $(this).attr("type");
		if (/date|email|month|number|search|tel|text|time|url|week/.test(type)
			&& event.keyCode == 13) {
			showAllErrorMessages();
		}
	});
};

$("form").each(createAllErrors);

// PAgination JS
getPagination('#table-id');
$('#maxRows').trigger('change');
function getPagination(table) {

	$('#maxRows').on('change', function() {
		$('.pagination').html('');						// reset pagination div
		var trnum = 0;									// reset tr counter 
		var maxRows = parseInt($(this).val());			// get Max Rows from select option

		var totalRows = $(table + ' tbody tr').length;		// numbers of rows 
		$(table + ' tr:gt(0)').each(function() {			// each TR in  table and not the header
			trnum++;									// Start Counter 
			if (trnum > maxRows) {						// if tr number gt maxRows

				$(this).hide();							// fade it out 
			} if (trnum <= maxRows) { $(this).show(); }// else fade in Important in case if it ..
		});											//  was fade out to fade it in 
		if (totalRows > maxRows) {						// if tr total rows gt max rows option
			var pagenum = Math.ceil(totalRows / maxRows);	// ceil total(rows/maxrows) to get ..  
			//	numbers of pages 
			for (var i = 1; i <= pagenum;) {			// for each page append pagination li 
				$('.pagination').append('<li data-page="' + i + '">\
                                  <span>'+ i++ + '<span class="sr-only">(current)</span></span>\
                                </li>').show();
			}											// end for i 


		} 												// end if row count > max rows
		$('.pagination li:first-child').addClass('active'); // add active class to the first li 


		//SHOWING ROWS NUMBER OUT OF TOTAL DEFAULT
		showig_rows_count(maxRows, 1, totalRows);
		//SHOWING ROWS NUMBER OUT OF TOTAL DEFAULT

		$('.pagination li').on('click', function(e) {		// on click each page
			e.preventDefault();
			var pageNum = $(this).attr('data-page');	// get it's number
			var trIndex = 0;							// reset tr counter
			$('.pagination li').removeClass('active');	// remove active class from all li 
			$(this).addClass('active');					// add active class to the clicked 


			//SHOWING ROWS NUMBER OUT OF TOTAL
			showig_rows_count(maxRows, pageNum, totalRows);
			//SHOWING ROWS NUMBER OUT OF TOTAL



			$(table + ' tr:gt(0)').each(function() {		// each tr in table not the header
				trIndex++;								// tr index counter 
				// if tr index gt maxRows*pageNum or lt maxRows*pageNum-maxRows fade if out
				if (trIndex > (maxRows * pageNum) || trIndex <= ((maxRows * pageNum) - maxRows)) {
					$(this).hide();
				} else { $(this).show(); } 				//else fade in 
			}); 										// end of for each tr in table
		});										// end of on click pagination list
	});
	// end of on select change 

	// END OF PAGINATION 

}




// SI SETTING
$(function() {
	// Just to append id number for each row  
	default_index();

});

//ROWS SHOWING FUNCTION
function showig_rows_count(maxRows, pageNum, totalRows) {
	//Default rows showing
	var end_index = maxRows * pageNum;
	var start_index = ((maxRows * pageNum) - maxRows) + parseFloat(1);
	var string = 'Showing ' + start_index + ' to ' + end_index + ' of ' + totalRows + ' entries';
	$('.rows_count').html(string);
}

// CREATING INDEX
function default_index() {
	$('table tr:eq(0)').prepend('<th> ID </th>')

	var id = 0;

	$('table tr:gt(0)').each(function() {
		id++
		$(this).prepend('<td>' + id + '</td>');
	});
}

// All Table search script
function FilterkeyWord_all_table() {

	// Count td if you want to search on all table instead of specific column

	var count = $('.table').children('tbody').children('tr:first-child').children('td').length;

	// Declare variables
	var input, filter, table, tr, td, i;
	input = document.getElementById("search_input_all");
	var input_value = document.getElementById("search_input_all").value;
	filter = input.value.toLowerCase();
	if (input_value != '') {
		table = document.getElementById("table-id");
		tr = table.getElementsByTagName("tr");

		// Loop through all table rows, and hide those who don't match the search query
		for (i = 1; i < tr.length; i++) {

			var flag = 0;

			for (j = 0; j < count; j++) {
				td = tr[i].getElementsByTagName("td")[j];
				if (td) {

					var td_text = td.innerHTML;
					if (td.innerHTML.toLowerCase().indexOf(filter) > -1) {
						//var td_text = td.innerHTML;  
						//td.innerHTML = 'shaban';
						flag = 1;
					} else {
						//DO NOTHING
					}
				}
			}
			if (flag == 1) {
				tr[i].style.display = "";
			} else {
				tr[i].style.display = "none";
			}
		}
	} else {
		//RESET TABLE
		$('#maxRows').trigger('change');
	}
}