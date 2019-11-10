Feature:	Login
  Description: This features will test Login Functionality
  Scenario:	Successful	Login	with	valid	credentials
    Given	User	is	on	Home	Page
    When	User	enters	UserName	and	Password
    Then	He	can	visit	the	practice	page

  Scenario:	Successful	LogOut
    When	User	LogOut	from	the	Application
    Then	he	cannot	visit	practice	page