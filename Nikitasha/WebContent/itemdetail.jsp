<%@ include file = "/META-INF/web/version_html/Layout/header.jsp" %>
<%@ include file = "/META-INF/web/version_html/Layout/subheader.jsp" %>
k+

<section class="page-content">
<div class="page-content-inner">
	<div class="panel-heading">
        <h3>Item Details</h3>
        <p>Here your Get All details of Items</p>
    </div>

    <!-- Basic Form Elements -->
    <section class="page-content">
			<div class="form-group row">
				<div class="col-md-3">
					<label class="form-control-label" for="l0">Item</label>
				</div>
				<div class="col-md-9">
					<div class="form-group row">
                                
                                <div class="col-md-9">
                                    <select class="form-control" id="l13" name="itemname">
                                        <option>Option 1</option>
                                        <option>Option 2</option>
                                        <option>Option 3</option>
                                        <option>Option 4</option>
                                        <option>Option 5</option>
                                    </select>
                                </div>
                            </div>
				</div>
			</div>
			<div class="form-group row">
				<div class="col-md-3">
					<label class="form-control-label" for="l0">Regular price</label>
				</div>
				<div class="col-md-9">
					<input type="text" class="form-control" placeholder="Regular price"
						id="l0" name="regularprice">
				</div>
			</div>
			<div class="form-group row">
				<div class="col-md-3">
					<label class="form-control-label" for="l0">Sell Price</label>
				</div>
				<div class="col-md-9">
					<input type="text" class="form-control" placeholder="Sell Price"
						id="l0" name="sellprice">
				</div>
			</div>
			
			<div class="form-group row">
				<div class="col-md-3">
					<label class="form-control-label" for="l0">Weight</label>
				</div>
				<div class="col-md-9">
					<input type="text" class="form-control" placeholder="Weight"
						id="l0" name="weight">
				</div>
			</div>
			<div class="form-group row">
				<div class="col-md-3">
					<label class="form-control-label" for="l0">Discount</label>
				</div>
				<div class="col-md-9">
					<input type="text" class="form-control" placeholder="Discount"
						id="l0" name="discount">
				</div>
			</div>
			<div class="form-group row">
				<div class="col-md-3">
					<label class="form-control-label" for="l0">Item Size</label>
				</div>
				<div class="col-md-9">
					<input type="text" class="form-control" placeholder="Item Size"
						id="l0" name="itemsize">
				</div>
			</div>
			<div class="form-group row">
				<div class="col-md-3">
					<label class="form-control-label" for="l0">Sleaves</label>
				</div>
				<div class="col-md-9">
					<input type="text" class="form-control" placeholder="Sleaves"
						id="l0" name="sleaves">
				</div>
			</div>
			<div class="form-group row">
				<div class="col-md-3">
					<label class="form-control-label" for="l0">Color</label>
				</div>
				<div class="col-md-9">
					<input type="text" class="form-control" placeholder="Color"
						id="l0" name="color">
				</div>
			</div>
			
				<div class="form-group row">
				<div class="col-md-3">
					<label class="form-control-label" for="l0">Parrern</label>
				</div>
				<div class="col-md-9">
					<input type="text" class="form-control" placeholder="Parrern"
						id="l0" name="pattern">
				</div>
			</div>
				<div class="form-group row">
				<div class="col-md-3">
					<label class="form-control-label" for="l0">Fabric</label>
				</div>
				<div class="col-md-9">
					<input type="text" class="form-control" placeholder="Fabric"
						id="l0" name="fabric">
				</div>
			</div>
			
			<div class="form-group row">
			<div class="form-group">
				<label for="l39">Image 1</label> <br> <input type="file"
					id="l39"> 
			</div>
			</div>
			<div class="form-group row">
			<div class="form-group">
				<label for="l39">Image 2</label> <br> <input type="file"
					id="l39"> 
			</div>
			</div>
			<div class="form-group row">
			<div class="form-group">
				<label for="l39">Image 3</label> <br> <input type="file"
					id="l39"> 
			</div>
			</div>
			<div class="form-group row">
			<div class="form-group">
				<label for="l39">Image 4</label> <br> <input type="file"
					id="l39"> 
			</div>
			</div>
			<div class="form-group row">
			<div class="form-group">
				<label for="l39">Image 5</label> <br> <input type="file"
					id="l39"> 
			</div>
			</div>
			




			<div class="form-group row">
				<div class="col-md-9 col-md-offset-3">
					<button type="button" class="btn width-150 btn-primary">Submit</button>
					<button type="button" class="btn btn-default">Cancel</button>
				</div>
			</div>
			

		</section>
    
    

</div>

<!-- Page Scripts -->
<script>
	$(function() {

		$('#example1').DataTable({
			responsive : true
		});

		$('#example2').DataTable({
			autoWidth : true,
			scrollX : true,
			fixedColumns : true
		});

		$('#example3').DataTable({
			autoWidth : true,
			scrollX : true,
			fixedColumns : true
		});
	});
</script>
<!-- End Page Scripts -->
</section>
    <!-- End -->

</div>
</section>

<div class="main-backdrop"><!-- --></div>

</body>
</html>