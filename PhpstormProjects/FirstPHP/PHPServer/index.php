<?php
/**
 * Created by PhpStorm.
 * User: SuperStar
 * Date: 2018/11/26
 * Time: 23:40
 */
header('Content-Type: text/event-stream');
header('Cache-Control: no-cache');

for($i = 0; $i < 100; $i++){
    date_default_timezone_set("Asia/shanghai");
    echo "event: newDate\n";
    echo "data: ".date('Y-m-d H-i-s');
    echo "\n\n";
    flush();
    sleep(1);
}