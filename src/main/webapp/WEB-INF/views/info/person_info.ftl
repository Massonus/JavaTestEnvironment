<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link href="templates/styles.css" rel="stylesheet">
    <title>Person info</title>
</head>
<body>
<br>
<nav>
    <div class="nav">
        <br>
        <#list menu as menuItem>
            <a href="${menuItem.link}">${menuItem.label}</a>
        </#list>
    </div>
</nav>

<h1>Hello ${person.getId()!""}</h1>
<p> ${person}

</body>
</html>