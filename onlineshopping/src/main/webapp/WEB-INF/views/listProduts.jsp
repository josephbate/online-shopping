<div class="container">

	<div class="row">

		<div class="col-md-3">
			<!-- side bar -->
			<%@include file="./shares/sidebar.jsp"%>
		</div>

		<div class="col-md-9">
		
			<!-- added bread crumbs -->
			<div class="row">
				<div class="col-md-12">
				
					<!-- all products -->
					<c:if test="${userClickAllProducts == true}">
						<ol class="breadcrumb">
							<li><a href="${contextRoot}/home">Home </a></li>
							<li class="active"> All Products</li>
						</ol>
					</c:if>
					
					<!-- category products -->
					<c:if test="${userClickCategoryProducts == true}">
						<ol class="breassdcrumb">
							<li><a href="${contextRoot}/home">Home</a></li>
							<li class="active"> Category</li>
							<li class="active">${category.name}</li>
						</ol>
					</c:if>
					
				</div>
			</div>
		</div>

	</div>

</div>