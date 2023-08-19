<?php
require('../Database/database.php');
session_start();
session_unset();
header("location: ../Html/index.php");
?>