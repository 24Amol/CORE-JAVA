<?php

session_start();

if (isset($_POST['submit'])) {

    $email = $_POST['email'];

    $emailquery = "select * from admin_login where username= '$email'";

    $query = mysqli_query($conn, $emailquery);

    // $emailcount = mysqli_num_rows($query);

    $headers = "From: myplace@example.com\r\n";
    $headers .= "Reply-To: myplace2@example.com\r\n";
    $headers .= "Return-Path: myplace@example.com\r\n";
    $headers .= "CC: sombodyelse@example.com\r\n";
    $headers .= "BCC: hidden@example.com\r\n";

    if ($query != "" || mysqli_num_rows($query) == 1) {

        //Write your Email Test address here
        $from = "rushimisal5@gmail.com";
        //Write the email address you are sending the email to
        $to = $email;
        $subject = "";
        $message = "Hi , $email . Click here to reset your password 
http://localhost/reset_password.php";

        //Remember the header parameter is optional
        $headers = "From:" . $from;
        mail($to, $subject, $message, $headers);
        $sent_mail = mail($to, $subject, $message, $headers);

        // print_r(error_get_last());
        if ($sent_mail) {

            echo "Mail sent successfully!";
        } else {
            $error_message = error_get_last();

            echo error_get_last();
        }
    } else {


        echo "<script>alert('Mail not Found..!');</script>";
    }
}
?>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>ForgetPassword</title>
    <link href="https://fonts.googleapis.com/css2?family=Alkatra:wght@700&family=Cabin&family=Cormorant+Garamond:wght@300&family=Courgette&family=Great+Vibes&family=Kalam:wght@300&family=Nunito:ital,wght@0,700;1,600&family=Roboto:ital,wght@0,400;0,900;1,300&family=Tilt+Neon&family=Tilt+Warp&display=swap" rel="stylesheet" />
    <link rel="stylesheet" href="../bootstrap/bootstrap-5.1.3-dist/css/bootstrap.min.css" />
    <script src="../bootstrap/bootstrap-5.1.3-dist/js/bootstrap.min.js"></script>

</head>
<style>
    * {
        padding: 0;
        margin: 0;
        box-sizing: border-box;
        font-family: 'Alkatra', cursive;
    }
</style>

<body>
    <div class="container py-5  d-flex justify-content-center align-items-center">

        <div class="row d-flex justify-content-center align-items-center w-75">
            <div class="col">
                <div class="card card-registration my-4 shadow rounded-3 p-5 d-flex justify-content-center align-items-center" style="border: none; background-color: #DCF1FF;">

                    <form class="w-50 d-flex align-items-center justify-content-center flex-column" method="post" action="">

                        <div class="form-group ">
                            <label for="exampleInputEmail1" class="fs-5">Email address</label>
                            <input type="email" class="form-control form-control-lg" id="exampleInputEmail1" name="email" aria-describedby="emailHelp" required pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" placeholder="Enter email">
                        </div>


                        <button type="submit" class="btn mt-4 shadow" name="submit" style="
                 
                    color: #262626;
                    font-size: 18px;
                    background-color: #9AC9DF;
                    ">Reset Password</button>
                        <p class="card-text text-center mt-3" style="font-Size:15px;font-family: 'Kalam';">
                            Kindly check your mail to reset password link
                        </p>

                        <div class="d-flex align-items-center justify-content-center pb-4">
                            <p class="mb-0 me-2" style="color: #262626;">Already have an account?</p>
                            <a href="../Pages/AdminLogin.php"><button type="button" class="btn btn-outline-danger">Login</button></a>
                        </div>


                    </form>

                </div>
            </div>
        </div>

</body>

</html>