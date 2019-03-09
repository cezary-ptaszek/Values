$(document).ready( function () {
	 var table = $('#valuesTable').DataTable({
			"sAjaxSource": "/showValues",
			"sAjaxDataProp": "",
			"order": [[ 0, "asc" ]],
			"aoColumns": [
			      { "mData": "id"},
		          { "mData": "kolumna1" },
				  { "mData": "kolumna2" },
				  { "mData": "kolumna3" },
				  { "mData": "kolumna4" },
			]
	 })
});