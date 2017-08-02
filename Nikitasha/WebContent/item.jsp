<%@page import="com.model.ItemType"%>
<%@page import="com.process.ItemImplementation"%>
<%@page import="java.util.List"%>
<%@ include file = "/META-INF/web/version_html/Layout/header.jsp" %>
<%@ include file = "/META-INF/web/version_html/Layout/subheader.jsp" %>
k+

<section class="page-content">
<div class="page-content-inner">
	<div class="panel-heading">
        <h3>Item Type</h3>
        <p>Please Enter Item Type</p>
    </div>

    <!-- Basic Form Elements -->
    <section class="panel">
        <div class="panel-body">
            <div class="row">
                <div class="col-lg-12">
                    <div class="margin-bottom-50">
                        <!-- Horizontal Form -->
                        <form action="rest/RestService/getItems" accept="GET">
                        
                        <div class="form-group row">
				<div class="col-md-3">
				<%
                                       ItemImplementation itemImplementation=new ItemImplementation();
                                       List<ItemType> itemTypes=itemImplementation.getItemTypes();
                                       
                                       %>        
					<label class="form-control-label" for="l0">Select Item Type</label>
				</div>
				<div class="col-md-9">
					<div class="form-group row">

                        
                                <div class="col-md-9">
                                    <select class="form-control" id="l13" name="itemType">
                                       
                                       <%for(ItemType i: itemTypes){ %>
									<option value="<%=i.getItemName() %>" ><%=i.getItemName()%></option>
									<%} %>
                                </div>
                            </div>
				</div>
			</div>
                        
                        
                            <div class="form-group row">
                                <div class="col-md-3">
                                    <label class="form-control-label" for="l0">Name</label>
                                </div>
                                <div class="col-md-9">
                                    <input type="text" class="form-control" placeholder="Name" id="l0" name="name" >
                                </div>
                            </div>
                            
                                <div class="form-group row">
                                    <div class="col-md-9 col-md-offset-3">
                                        <input type="submit" class="btn width-150 btn-primary"></button>
                                        <button type="button" class="btn btn-default">Cancel</button>
                                    </div>
                                </div>
                        </form>
                        <!-- End Horizontal Form -->
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- End -->

</div>
</section>

<div class="main-backdrop"><!-- --></div>

</body>
</html>