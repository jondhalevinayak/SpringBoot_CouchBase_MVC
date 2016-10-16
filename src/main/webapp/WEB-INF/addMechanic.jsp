<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Home page</title>
    <link rel="stylesheet" href="/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/bootstrap-theme.min.css">
    <script src="/js/jquery.min.js"></script>
    <script src="/js/bootstrap.min.js"></script>

    <script type="text/javascript"> 
        function addMechanic() {
            var mechId = $('#mechanicId').val();
            var mechName = $('#mechanicName').val();
            var mechanicVo = {};
            mechanicVo['mechanicId'] = mechId;
            mechanicVo['mechanicName'] = mechName;
            var jsonMechVo = JSON.stringify(mechanicVo);

            $.ajax({ type : "POST",
                contentType : 'application/json',
                url : "/saveMechanic",
                dataType : 'JSON',
                data : jsonMechVo,
                cache : false,
                success : function(result) {
                    if (result.success) {
                        alert("Data Saved Successfully");
                    } else {
                        alert("Error Occurred !!");
                        return false;
                    }
                }

            });
        }
    
    
    </script>
</head>
<body>

<div class="example">
    <div class="container">

            <nav role="navigation">
                <div class="alert alert-info">
                    <center><h3>Add Mechanic</h3></center>
                </div>
                <div class='col-xs-12 col-sm-12 col-md-12 col-lg-12' id="upsEqp">
                    <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
                        <div class="form-group">
                            <label class="col-xs-4 col-sm-4 col-md-4 col-lg-4 control-label">Mechanic Id: </label>
                            <div class="col-xs-8 col-sm-8 col-md-8 col-lg-8">
                                <input type="text" id="mechanicId" class="form-control input-xs " />
                            </div>
                        </div>
                    </div>
                    <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
                        <div class="form-group">
                            <label class="col-xs-4 col-sm-4 col-md-4 col-lg-4 control-label">Mechanic Name: </label>
                            <div class="col-xs-8 col-sm-8 col-md-8 col-lg-8">
                                <input type="text" id="mechanicName" class="form-control input-xs " />
                            </div>
                        </div>
                    </div>
                </div>
                </br></br></br></br>
                <div class="alert alert-info">
                    <center><button type="button" align="center" tabindex="-1" name="btnAddMech"  id='btnAddMech' onclick='addMechanic()' rel="tooltip"  data-original-title="" data-placement="bottom"
                                    class="btn btn-primary">Save</button></center>
                </div>

            </nav>



    </div>
</div>
</body>
</html>