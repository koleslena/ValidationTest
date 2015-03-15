<%@ taglib uri="http://www.springframework.org/tags/form"
    prefix="springForm"%>

<html>
<body>
	<h1>${message}</h1>
 <springForm:form method="POST" commandName="mod"
        action="xx">
        <table>
            <tr>
                <td>Name:</td>
                <td><springForm:input path="hello" /></td>
                <td><springForm:errors path="hello" cssClass="error" /></td>
            </tr>
            <tr>
                <td colspan="3"><input type="submit" value="Save Customer"></td>
            </tr>
        </table>

    </springForm:form>
</body>
</html>