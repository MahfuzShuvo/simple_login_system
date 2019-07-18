<div class="form-group">
    <label><g:message code="first.name"/> *</label>
    <g:textField name="firstName" class="form-control" value="${member?.firstName}" placeholder="Please enter First Name"/>
    <UIHelper:renderErrorMessage fieldName="firstName" model="${member}" errorMessage="please.enter.first.name"/>
</div>

<div class="form-group">
    <label><g:message code="last.name"/></label>
    <g:textField name="lastName" class="form-control" value="${member?.lastName}" placeholder="Please enter Last Name"/>
</div>

<div class="form-group">
    <label><g:message code="add"/> *</label>
    <g:textField name="address" class="form-control" value="${member?.address}" placeholder="Please enter Address"/>
    <UIHelper:renderErrorMessage fieldName="email" model="${member}" errorMessage="Please enter Address"/>
</div>

<div class="form-group">
    <label><g:message code="email.address"/> *</label>
    <g:field type="email" name="email" class="form-control" value="${member?.email}" placeholder="Please enter Email"/>
    <UIHelper:renderErrorMessage fieldName="email" model="${member}" errorMessage="Your Email Address is not Valid / Already Exist in System"/>
</div>

<div class="form-group">
    <label><g:message code="con"/> *</label>
    <g:textField name="phone" class="form-control" value="${member?.phone}" placeholder="Please enter Contact Number"/>
    <UIHelper:renderErrorMessage fieldName="phone" model="${member}" errorMessage="Please enter Contact Number."/>
</div>

<div class="form-group">
    <label><g:message code="birth.date"/></label>
    <g:textField name="birth" class="form-control" value="${member?.birth}" placeholder="Please enter Birth Date"/>
</div>

<g:if test="${!edit}">
    <div class="form-group">
        <label><g:message code="password"/> *</label>
        <g:passwordField name="password" class="form-control" value="${member?.password}" placeholder="Please Enter Password"/>
        <UIHelper:renderErrorMessage fieldName="password" model="${member}" errorMessage="Please enter a Password."/>
    </div>
</g:if>