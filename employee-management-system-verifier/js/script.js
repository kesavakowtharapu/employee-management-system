var url_endpoint='http://localhost:8080/v1/employee/';
function createEmployee(){
    var employeeData = {
        name:$('#name').val(),
        dob:$('#dob').val(),
        gender:$('input[name=gender]:checked').val(),
        address:$('#address').val(),
        phone:$('#phone').val(),
        email:$('#email').val()
    };
    $.ajax({url: url_endpoint + 'create',
        type:'POST',
        contentType:'application/json',
        data:JSON.stringify(employeeData),
        success: function(result){
             $('#dialog').dialog();
             $('#successMsg').text('The employee has been added successfully!');
             clearDetails();
        }});
}

function clearDetails(){
        $('#name').val(''),
        $('#dob').val(''),
        $('input[name=gender]:checked').val(false),
        $('#address').val(''),
        $('#phone').val(''),
        $('#email').val('')
}
