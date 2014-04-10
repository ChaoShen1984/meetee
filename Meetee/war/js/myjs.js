function apendPanel(title, count, message, imgUrl) {
	count++;
	$("#panelHolder").append("<div class='panel panel-info'><div class='panel-heading'><h3 class='panel-title'> <img src='favicon.ico'>" + title + count + "</h3></div><div class='panel-body'>" + message + "<img src=" + imgUrl + "></div><div class='panel-footer'><button>Join</button> <button>cancel</button></div></div>");
}