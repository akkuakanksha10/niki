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
                        <form action="rest/RestService/saveItemType" method="post">
                            <div class="form-group row">
                                <div class="col-md-3">
                                    <label class="form-control-label" for="l0">Name</label>
                                </div>
                                <div class="col-md-9">
                                    <input type="text" class="form-control" placeholder="Name" id="l0" name="itemType">
                                </div>
                            </div>
                            
                                <div class="form-group row">
                                    <div class="col-md-9 col-md-offset-3">

                                        <button type="submit" class="btn width-150 btn-primary">Submit</button>

                                        
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