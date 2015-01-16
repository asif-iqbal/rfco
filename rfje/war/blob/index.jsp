<%@page pageEncoding="UTF-8" isELIgnored="false" session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>

<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
  <title>blobstore Index</title>
</head>
<body>
  <p>Blobstore Upload</p>
  <form action="${f:url(uploadUrl)}" method="post" enctype="multipart/form-data">
    <input type="file" name="uploadFile">
    <input type="submit" value="Submit">
  </form>

  <table>
    <tr>
      <th>FileName</th>
      <th>ContentType</th>
      <th>Size</th>
      <th>Creation</th>
      <th>md5Hash</th>
    </tr>
  <c:forEach var="e" items="${uploadedFiles}">
    <tr>
      <td><a href="${f:h(e.serveURL)}" >${f:h(e.filename)}</a></td>
      <td>${f:h(e.contentType)}</td>
      <td>${f:h(e.size)}</td>
      <td>${f:h(e.creation)}</td>
      <td>${f:h(e.md5Hash)}</td>
    </tr>
  </c:forEach>
  </table>

</body>
</html>
