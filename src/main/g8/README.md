This is your new Play application with Bootstrap
================================================

This file will be packaged with your application, when using `play dist`.


Bootstrap
=========

Added with inspiration from [2.0 tips](http://www.playframework.com/documentation/2.0/Tips). Bootstrap can be used
by adding the following line to your views (already added in main.scala.html).

    <link rel="stylesheet" media="screen" href="@routes.Assets.at("stylesheets/bootstrap/bootstrap.min.css")" />

*Note:* The settings added will only compile `stylesheets/bootstrap/bootstrap.less` and `stylesheets/*.less` files.
If you have any other LESS files in other subdirectories under `stylesheets`; adjust the function accordingly.