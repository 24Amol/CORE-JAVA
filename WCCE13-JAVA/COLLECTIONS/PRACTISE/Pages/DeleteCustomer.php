<?php
require('../Database/database.php');

$id = $_GET['id'];

$query = " DELETE FROM customer_details WHERE id= '$id' ";
$data = mysqli_query($conn, $query);

if ($data) {
    echo "<script>alert('Record Deleted')</script>";


?>
    <meta http-equiv="refresh" content="0; url = http://localhost:3000/Pages/display.php" />

<?php

} else {
    echo "<script>alert('Failed to Delete')</script>";
}

?>