<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link href="templates/styles.css" rel="stylesheet">
    <title>Course List</title>
</head>
<body>
<h1>Course List</h1>
<br>
<nav>
    <div class="nav">
        <br>
        <#list menu as menuItem>
            <a href="${menuItem.link}">${menuItem.label}</a>
        </#list>
    </div>
</nav>
<h2>Select the button</h2>

<table>
    <thead>
    <tr>
        <th>Id</th>
        <th>Task</th>
        <th>Deadline</th>
    </tr>
    </thead>
    <tbody>
    <#list homeworks as homework>
        <tr>
            <td>${homework.id!""}</td>
            <td>
                <li><a href="/Test_war_exploded/homework/${homework.id!""}">${homework.task!""}</a></li>
            </td>
            <td>${homework.deadline!""}</td>
        </tr>
    </#list>
    </tbody>
</table>


<h2>Add Homework</h2>
<form method="post" action="/Test_war_exploded/addHomework">
    <label for="task">Task:</label>
    <input type="text" id="task" name="task" required><br><br>

    <label for="lecture_id">Lecture id:</label>
    <input type="number" id="lecture_id" name="lectureId" required><br><br>

    <input type="submit" value="Send">
</form>
</body>
</html>