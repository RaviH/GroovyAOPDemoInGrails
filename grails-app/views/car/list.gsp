
<%@ page import="com.mayabansi.demo.Car" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'car.label', default: 'Car')}" />
        <title><g:message code="default.list.label" args="[entityName]" /></title>
    </head>
    <body>
        <div class="nav">
            <span class="menuButton"><a class="home" href="${createLink(uri: '/')}">Home</a></span>
            <span class="menuButton"><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></span>
        </div>
        <div class="body">
            <h1><g:message code="default.list.label" args="[entityName]" /></h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <div class="list">
                <table>
                    <thead>
                        <tr>
                        
                            <g:sortableColumn property="id" title="${message(code: 'car.id.label', default: 'Id')}" />
                        
                            <g:sortableColumn property="model" title="${message(code: 'car.model.label', default: 'Model')}" />
                        
                            <g:sortableColumn property="make" title="${message(code: 'car.make.label', default: 'Make')}" />
                        
                        </tr>
                    </thead>
                    <tbody>
                    <g:each in="${carInstanceList}" status="i" var="carInstance">
                        <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
                        
                            <td><g:link action="show" id="${carInstance.id}">${fieldValue(bean: carInstance, field: "id")}</g:link></td>
                        
                            <td>${fieldValue(bean: carInstance, field: "model")}</td>
                        
                            <td>${fieldValue(bean: carInstance, field: "make")}</td>
                        
                        </tr>
                    </g:each>
                    </tbody>
                </table>
            </div>
            <div class="paginateButtons">
                <g:paginate total="${carInstanceTotal}" />
            </div>
        </div>
    </body>
</html>
