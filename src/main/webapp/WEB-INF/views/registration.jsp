<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <!--[if lt IE 8]>
            <p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
        <![endif]-->
        <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
          <div class="container">
            <div class="navbar-header">
              <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
              </button>
              <a class="navbar-brand" href="#">Remot Foster parent</a>
            </div>
            <div id="navbar" class="navbar-collapse collapse">
              <form class="navbar-form navbar-right" role="form">
                <div class="form-group">
                  
                </div>
                <button type="submit" class="btn btn-success">Sign in</button>
              </form>
            </div><!--/.navbar-collapse -->


          </div>
        </nav>

        
  <!-- Indicators -->
 
      <hr>
                <body>    
            <div class="container">
            <form action="" class="register">
                <h1>Registration</h1>
                <fieldset class="row1">
                    <legend>Account Details
                    </legend>
                    <p>
                        <label>Email *
                        </label>
                        <input type="text" name="email"/>
                        <label>Repeat email *
                        </label>
                        <input type="text" name=repeatemail/>
                    </p>
                    <p>
                        <label>Password*
                        </label>
                        <input type="text" name=Password/>
                        <label>Repeat Password*
                        </label>
                        <input type="text" name="Repeat Password"/>
                        <label class="obinfo">* obligatory fields
                        </label>
                    </p>
                </fieldset>
                <fieldset class="row2">
                    <legend>Personal Details
                    </legend>
                    <p>
                        <label>Name *
                        </label>
                        <input type="text" name="name" class="long"/>
                    </p>
                    <p>
                        <label>Phone *
                        </label>
                        <input type="text" name="phone" maxlength="10"/>
                    </p>
                    <p>
                        <label class="optional">Street
                        </label>
                        <input type="text" name="optional" class="long"/>
                    </p>
                    <p>
                        <label>City *
                        </label>
                        <input type="text" name="city" class="long"/>
                    </p>
                    <p>
                        <label>Country *
                        </label>
                        <select>
                            <option>
                            </option>
                            <option value="1">United States
                            </option>
                        </select>
                    </p>
                    <p>
                        <label class="optional">Website
                        </label>
                        <input class="long" name="website" type="text" value="http://"/>

                    </p>
                </fieldset>
                <fieldset class="row3">
                    <legend>Further Information
                    </legend>
                    <p>
                        <label>Gender *</label>
                        <input type="radio" name="gender" value="radio"/>
                        <label class="gender">Male</label>
                        <input type="radio" name="gender" value="radio"/>
                        <label class="gender">Female</label>
                    </p>
                    <p>
                        <label>Birthdate *
                        </label>
                        <select class="date">
                            <option value="1">01
                            </option>
                            <option value="2">02
                            </option>
                            <option value="3">03
                            </option>
                            <option value="4">04
                            </option>
                            <option value="5">05
                            </option>
                            <option value="6">06
                            </option>
                            <option value="7">07
                            </option>
                            <option value="8">08
                            </option>
                            <option value="9">09
                            </option>
                            <option value="10">10
                            </option>
                            <option value="11">11
                            </option>
                            <option value="12">12
                            </option>
                            <option value="13">13
                            </option>
                            <option value="14">14
                            </option>
                            <option value="15">15
                            </option>
                            <option value="16">16
                            </option>
                            <option value="17">17
                            </option>
                            <option value="18">18
                            </option>
                            <option value="19">19
                            </option>
                            <option value="20">20
                            </option>
                            <option value="21">21
                            </option>
                            <option value="22">22
                            </option>
                            <option value="23">23
                            </option>
                            <option value="24">24
                            </option>
                            <option value="25">25
                            </option>
                            <option value="26">26
                            </option>
                            <option value="27">27
                            </option>
                            <option value="28">28
                            </option>
                            <option value="29">29
                            </option>
                            <option value="30">30
                            </option>
                            <option value="31">31
                            </option>
                        </select>
                        <select>
                            <option value="1">January
                            </option>
                            <option value="2">February
                            </option>
                            <option value="3">March
                            </option>
                            <option value="4">April
                            </option>
                            <option value="5">May
                            </option>
                            <option value="6">June
                            </option>
                            <option value="7">July
                            </option>
                            <option value="8">August
                            </option>
                            <option value="9">September
                            </option>
                            <option value="10">October
                            </option>
                            <option value="11">November
                            </option>
                            <option value="12">December
                            </option>
                        </select>
                        <input class="year" type="text" size="4" maxlength="4"/>e.g 1976
                    </p>
                    <p>
                        <label>Nationality *
                        </label>
                        <select>
                            <option value="0">
                            </option>
                            <option value="1">United States
                            </option>
                        </select>
                    </p>
                    <p>
                        <label>Children *
                        </label>
                        <input type="checkbox" name="children" value="" />
                    </p>
                    <div class="infobox"><h4>Helpful Information</h4>
                        <p></p>
                    </div>
                </fieldset>
                <fieldset class="row4">
                    <legend>Terms and Mailing
                    </legend>
                    <p class="agreement">
                        <input type="checkbox"   value=""/>
                        <label>*  I accept the <a href="#">Terms and Conditions</a></label>
                    </p>
                    <p class="agreement">
                        <input type="checkbox" value=""/>
                        <label>I want to receive personalized offers by your site</label>
                    </p>
                    <p class="agreement">
                        <input type="checkbox" value=""/>
                        <label>Allow partners to send me personalized offers and related services</label>
                    </p>
                </fieldset>
                <div><button class="button">Register &raquo;</button></div>
            </form>
                </div>
        </body>

      <footer>
        <p>&copy; Company 2016</p>
      </footer>
    </div> <!-- /container -->       
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
        <script>window.jQuery || document.write('<script src="js/vendor/jquery-1.11.2.min.js"><\/script>')</script>

        <script src="js/vendor/bootstrap.min.js"></script>

        <script src="js/main.js"></script>

</body>
</html>