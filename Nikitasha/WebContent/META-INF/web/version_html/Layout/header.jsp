<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>Dashboard | Nikitasha Boutique</title>

    <link href="<%=application.getContextPath()%>/resources/assets/common/img/favicon.144x144.png" rel="apple-touch-icon" type="image/png" sizes="144x144">
    <link href="<%=application.getContextPath()%>/resources/assets/common/img/favicon.114x114.png" rel="apple-touch-icon" type="image/png" sizes="114x114">
    <link href="<%=application.getContextPath()%>/resources/assets/common/img/favicon.72x72.png" rel="apple-touch-icon" type="image/png" sizes="72x72">
    <link href="<%=application.getContextPath()%>/resources/assets/common/img/favicon.57x57.png" rel="apple-touch-icon" type="image/png">
    <link href="<%=application.getContextPath()%>/resources/assets/common/img/favicon.png" rel="icon" type="image/png">
    <link href="favicon.ico" rel="shortcut icon">

    <!-- HTML5 shim and Respond.js for < IE9 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

    <!-- Vendors Styles -->
    <!-- v1.0.0 -->
    <link rel="stylesheet" type="text/css" href="<%=application.getContextPath()%>/resources/assets/vendors/bootstrap/dist/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="<%=application.getContextPath()%>/resources/assets/vendors/jscrollpane/style/jquery.jscrollpane.css">
    <link rel="stylesheet" type="text/css" href="<%=application.getContextPath()%>/resources/assets/vendors/ladda/dist/ladda-themeless.min.css">
    <link rel="stylesheet" type="text/css" href="<%=application.getContextPath()%>/resources/assets/vendors/select2/dist/css/select2.min.css">
    <link rel="stylesheet" type="text/css" href="<%=application.getContextPath()%>/resources/assets/vendors/eonasdan-bootstrap-datetimepicker/build/css/bootstrap-datetimepicker.min.css">
    <link rel="stylesheet" type="text/css" href="<%=application.getContextPath()%>/resources/assets/vendors/fullcalendar/dist/fullcalendar.min.css">
    <link rel="stylesheet" type="text/css" href="<%=application.getContextPath()%>/resources/assets/vendors/cleanhtmlaudioplayer/src/player.css">
    <link rel="stylesheet" type="text/css" href="<%=application.getContextPath()%>/resources/assets/vendors/cleanhtmlvideoplayer/src/player.css">
    <link rel="stylesheet" type="text/css" href="<%=application.getContextPath()%>/resources/assets/vendors/bootstrap-sweetalert/dist/sweetalert.css">
    <link rel="stylesheet" type="text/css" href="<%=application.getContextPath()%>/resources/assets/vendors/summernote/dist/summernote.css">
    <link rel="stylesheet" type="text/css" href="<%=application.getContextPath()%>/resources/assets/vendors/owl.carousel/dist/assets/owl.carousel.min.css">
    <link rel="stylesheet" type="text/css" href="<%=application.getContextPath()%>/resources/assets/vendors/ionrangeslider/css/ion.rangeSlider.css">
    <link rel="stylesheet" type="text/css" href="<%=application.getContextPath()%>/resources/assets/vendors/datatables/media/css/dataTables.bootstrap4.min.css">
    <link rel="stylesheet" type="text/css" href="<%=application.getContextPath()%>/resources/assets/vendors/c3/c3.min.css">
    <link rel="stylesheet" type="text/css" href="<%=application.getContextPath()%>/resources/assets/vendors/chartist/dist/chartist.min.css">

    <!-- Clean UI Styles -->
    <link rel="stylesheet" type="text/css" href="<%=application.getContextPath()%>/resources/assets/common/css/source/main.css">

    <!-- Vendors Scripts -->
    <!-- v1.0.0 -->
    <script src="<%=application.getContextPath()%>/resources/assets/vendors/jquery/jquery.min.js"></script>
    <script src="<%=application.getContextPath()%>/resources/assets/vendors/tether/dist/js/tether.min.js"></script>
    <script src="<%=application.getContextPath()%>/resources/assets/vendors/bootstrap/dist/js/bootstrap.min.js"></script>
    <script src="<%=application.getContextPath()%>/resources/assets/vendors/jquery-mousewheel/jquery.mousewheel.min.js"></script>
    <script src="<%=application.getContextPath()%>/resources/assets/vendors/jscrollpane/script/jquery.jscrollpane.min.js"></script>
    <script src="<%=application.getContextPath()%>/resources/assets/vendors/spin.js/spin.js"></script>
    <script src="<%=application.getContextPath()%>/resources/assets/vendors/ladda/dist/ladda.min.js"></script>
    <script src="<%=application.getContextPath()%>/resources/assets/vendors/select2/dist/js/select2.full.min.js"></script>
    <script src="<%=application.getContextPath()%>/resources/assets/vendors/html5-form-validation/dist/jquery.validation.min.js"></script>
    <script src="<%=application.getContextPath()%>/resources/assets/vendors/jquery-typeahead/dist/jquery.typeahead.min.js"></script>
    <script src="<%=application.getContextPath()%>/resources/assets/vendors/jquery-mask-plugin/dist/jquery.mask.min.js"></script>
    <script src="<%=application.getContextPath()%>/resources/assets/vendors/autosize/dist/autosize.min.js"></script>
    <script src="<%=application.getContextPath()%>/resources/assets/vendors/bootstrap-show-password/bootstrap-show-password.min.js"></script>
    <script src="<%=application.getContextPath()%>/resources/assets/vendors/moment/min/moment.min.js"></script>
    <script src="<%=application.getContextPath()%>/resources/assets/vendors/eonasdan-bootstrap-datetimepicker/build/js/bootstrap-datetimepicker.min.js"></script>
    <script src="<%=application.getContextPath()%>/resources/assets/vendors/fullcalendar/dist/fullcalendar.min.js"></script>
    <script src="<%=application.getContextPath()%>/resources/assets/vendors/cleanhtmlaudioplayer/src/jquery.cleanaudioplayer.js"></script>
    <script src="<%=application.getContextPath()%>/resources/assets/vendors/cleanhtmlvideoplayer/src/jquery.cleanvideoplayer.js"></script>
    <script src="<%=application.getContextPath()%>/resources/assets/vendors/bootstrap-sweetalert/dist/sweetalert.min.js"></script>
    <script src="<%=application.getContextPath()%>/resources/assets/vendors/remarkable-bootstrap-notify/dist/bootstrap-notify.min.js"></script>
    <script src="<%=application.getContextPath()%>/resources/assets/vendors/summernote/dist/summernote.min.js"></script>
    <script src="<%=application.getContextPath()%>/resources/assets/vendors/owl.carousel/dist/owl.carousel.min.js"></script>
    <script src="<%=application.getContextPath()%>/resources/assets/vendors/ionrangeslider/js/ion.rangeSlider.min.js"></script>
    <script src="<%=application.getContextPath()%>/resources/assets/vendors/nestable/jquery.nestable.js"></script>
    <script src="<%=application.getContextPath()%>/resources/assets/vendors/datatables/media/js/jquery.dataTables.min.js"></script>
    <script src="<%=application.getContextPath()%>/resources/assets/vendors/datatables/media/js/dataTables.bootstrap4.min.js"></script>
    <script src="<%=application.getContextPath()%>/resources/assets/vendors/datatables-fixedcolumns/js/dataTables.fixedColumns.js"></script>
    <script src="<%=application.getContextPath()%>/resources/assets/vendors/datatables-responsive/js/dataTables.responsive.js"></script>
    <script src="<%=application.getContextPath()%>/resources/assets/vendors/editable-table/mindmup-editabletable.js"></script>
    <script src="<%=application.getContextPath()%>/resources/assets/vendors/d3/d3.min.js"></script>
    <script src="<%=application.getContextPath()%>/resources/assets/vendors/c3/c3.min.js"></script>
    <script src="<%=application.getContextPath()%>/resources/assets/vendors/chartist/dist/chartist.min.js"></script>
    <script src="<%=application.getContextPath()%>/resources/assets/vendors/peity/jquery.peity.min.js"></script>
    <!-- v1.0.1 -->
    <script src="<%=application.getContextPath()%>/resources/assets/vendors/chartist-plugin-tooltip/dist/chartist-plugin-tooltip.min.js"></script>
    <!-- v1.1.1 -->
    <script src="<%=application.getContextPath()%>/resources/assets/vendors/gsap/src/minified/TweenMax.min.js"></script>
    <script src="<%=application.getContextPath()%>/resources/assets/vendors/hackertyper/hackertyper.js"></script>
    <script src="<%=application.getContextPath()%>/resources/assets/vendors/jquery-countTo/jquery.countTo.js"></script>

    <!-- Clean UI Scripts -->
    <script src="<%=application.getContextPath()%>/resources/assets/common/js/common.js"></script>
    <script src="<%=application.getContextPath()%>/resources/assets/common/js/demo.temp.js"></script>
</head>
<body class="theme-dark">
<nav class="left-menu" left-menu>
    <div class="logo-container">
        <a href="index.html" class="logo">
            <img src="<%=application.getContextPath()%>/resources/assets/common/img/logo.png" alt="Clean UI Admin Template" />
            <img class="logo-inverse" src="<%=application.getContextPath()%>/resources/assets/common/img/logo-inverse.png" alt="Clean UI Admin Template" />
        </a>
    </div>
    <div class="left-menu-inner scroll-pane">
        <ul class="left-menu-list left-menu-list-root list-unstyled">
            <li class="left-menu-list-active">
                <a class="left-menu-link" href="index.html">
                    <i class="left-menu-link-icon icmn-home2"><!-- --></i>
                    <span class="menu-top-hidden">Dashboard</span> Nikitasha
                </a>
            </li>
            <li class="left-menu-list-submenu">
                <a class="left-menu-link" href="javascript: void(0);">
                    <i class="left-menu-link-icon icmn-files-empty2"><!-- --></i>
                    Add Product
                </a>
                <ul class="left-menu-list list-unstyled">
                    <li>
                        <a class="left-menu-link" href="<%=application.getContextPath()%>/itemtype.jsp">
                            Item Type 
                        </a>
                    </li>
                    <li>
                        <a class="left-menu-link" href="<%=application.getContextPath()%>/item.jsp">
                            Item 
                        </a>
                    </li>
                    <li>
                        <a class="left-menu-link" href="<%=application.getContextPath()%>/itemdetail.jsp">
                            Item Detail
                        </a>
                    </li>
                    <li>
                        <a class="left-menu-link" href="<%=application.getContextPath()%>/itemsize.jsp">
                            Item Size
                        </a>
                    </li>
                    <li>
                        <a class="left-menu-link" href="<%=application.getContextPath()%>/stock.jsp">
                            Item Stock
                        </a>
                    </li>

                </ul>
            </li>
            <li class="left-menu-list-separator"><!-- --></li>
            <li class="left-menu-list-submenu">
                <a class="left-menu-link" href="javascript: void(0);">
                    Forms
                </a>
                <ul class="left-menu-list list-unstyled">
                    <li>
                        <a class="left-menu-link" href="forms-basic-form-elements.html">
                            Basic Form Elements
                        </a>
                    </li>
                    <li>
                        <a class="left-menu-link" href="forms-buttons.html">
                            Buttons
                        </a>
                    </li>
                    <li>
                        <a class="left-menu-link" href="forms-dropdowns.html">
                            Dropdowns
                        </a>
                    </li>
                    <li>
                        <a class="left-menu-link" href="forms-selectboxes.html">
                            Selectboxes
                        </a>
                    </li>
                    <li>
                        <a class="left-menu-link" href="forms-checkboxes-radio.html">
                            Checkboxes / Radio
                        </a>
                    </li>
                    <li>
                        <a class="left-menu-link" href="forms-form-validation.html">
                            Form Validation
                        </a>
                    </li>
                    <li>
                        <a class="left-menu-link" href="forms-autocomplete.html">
                            Autocomplete
                        </a>
                    </li>
                    <li>
                        <a class="left-menu-link" href="forms-input-mask.html">
                            Input Mask
                        </a>
                    </li>
                    <li>
                        <a class="left-menu-link" href="forms-extras.html">
                            Extras
                        </a>
                    </li>
                </ul>
            </li>
            <li class="left-menu-list-submenu">
                <a class="left-menu-link" href="javascript: void(0);">
                    Components
                </a>
                <ul class="left-menu-list list-unstyled">
                    <li>
                        <a class="left-menu-link" href="components-date-picker.html">
                            Date Picker
                        </a>
                    </li>
                    <li>
                        <a class="left-menu-link" href="components-calendar.html">
                            Calendar
                        </a>
                    </li>
                    <li>
                        <a class="left-menu-link" href="components-carousel.html">
                            Carousel
                        </a>
                    </li>
                    <li>
                        <a class="left-menu-link" href="components-media-players.html">
                            Media Players <span class="label left-menu-label label-default">22$ FREE</span>
                        </a>
                    </li>
                    <li>
                        <a class="left-menu-link" href="components-slider.html">
                            Slider
                        </a>
                    </li>
                    <li>
                        <a class="left-menu-link" href="components-modal.html">
                            Modal
                        </a>
                    </li>
                    <li>
                        <a class="left-menu-link" href="components-tooltips-popovers.html">
                            Tooltips & Popovers
                        </a>
                    </li>
                    <li>
                        <a class="left-menu-link" href="components-notifications-alerts.html">
                            Notifications & Alerts
                        </a>
                    </li>
                    <li>
                        <a class="left-menu-link" href="components-progress-bars.html">
                            Progress Bars
                        </a>
                    </li>
                    <li>
                        <a class="left-menu-link" href="components-badges-labels.html">
                            Badges & Labels
                        </a>
                    </li>
                    <li>
                        <a class="left-menu-link" href="components-steps.html">
                            Steps
                        </a>
                    </li>
                    <li>
                        <a class="left-menu-link" href="components-pagination.html">
                            Pagination
                        </a>
                    </li>
                    <li>
                        <a class="left-menu-link" href="components-collapse.html">
                            Collapse
                        </a>
                    </li>
                    <li>
                        <a class="left-menu-link" href="components-tabs.html">
                            Tabs
                        </a>
                    </li>
                    <li>
                        <a class="left-menu-link" href="components-text-editor.html">
                            Text Editor
                        </a>
                    </li>
                    <li>
                        <a class="left-menu-link" href="components-nestable.html">
                            Nestable
                        </a>
                    </li>
                </ul>
            </li>
            <li class="left-menu-list-submenu">
                <a class="left-menu-link" href="javascript: void(0);">
                    Tables
                </a>
                <ul class="left-menu-list list-unstyled">
                    <li>
                        <a class="left-menu-link" href="tables-basic-tables.html">
                            Basic Tables
                        </a>
                    </li>
                    <li>
                        <a class="left-menu-link" href="tables-datatables.html">
                            DataTables
                        </a>
                    </li>
                    <li>
                        <a class="left-menu-link" href="tables-editable-tables.html">
                            Editable Tables
                        </a>
                    </li>
                </ul>
            </li>
            <li class="left-menu-list-submenu">
                <a class="left-menu-link" href="javascript: void(0);">
                    Charts
                </a>
                <ul class="left-menu-list list-unstyled">
                    <li>
                        <a class="left-menu-link" href="charts-chartistjs.html">
                            Chartist.js
                        </a>
                    </li>
                    <li>
                        <a class="left-menu-link" href="charts-c3.html">
                            C3
                        </a>
                    </li>
                    <li>
                        <a class="left-menu-link" href="charts-peity.html">
                            Peity
                        </a>
                    </li>
                </ul>
            </li>
            <li class="left-menu-list-separator"><!-- --></li>
            <li>
                <a class="left-menu-link" href="apps-profile.html">
                    <i class="left-menu-link-icon icmn-profile"><!-- --></i>
                    Profile
                </a>
            </li>
            <li>
                <a class="left-menu-link" href="apps-messaging.html">
                    <i class="left-menu-link-icon icmn-bubbles5"><!-- --></i>
                    Messaging
                </a>
            </li>
            <li>
                <a class="left-menu-link" href="apps-mail.html">
                    <i class="left-menu-link-icon icmn-mail2"><!-- --></i>
                    Mail
                </a>
            </li>
            <li>
                <a class="left-menu-link" href="apps-calendar.html">
                    <i class="left-menu-link-icon icmn-calendar"><!-- --></i>
                    Calendar
                </a>
            </li>
            <li>
                <a class="left-menu-link" href="apps-gallery.html">
                    <i class="left-menu-link-icon icmn-images"><!-- --></i>
                    Gallery
                </a>
            </li>
            <li class="left-menu-list-separator"><!-- --></li>
            <li class="left-menu-list-submenu">
                <a class="left-menu-link" href="javascript: void(0);">
                    <i class="left-menu-link-icon icmn-stack3"><!-- --></i>
                    Layout
                </a>
                <ul class="left-menu-list list-unstyled">
                    <li>
                        <a class="left-menu-link" href="layout-grid.html">
                            Grid
                        </a>
                    </li>
                    <li>
                        <a class="left-menu-link" href="layout-panels.html">
                            Panels / Cards
                        </a>
                    </li>
                    <li>
                        <a class="left-menu-link" href="layout-sidebars.html">
                            Sidebars
                        </a>
                    </li>
                    <li>
                        <a class="left-menu-link" href="layout-utilities.html">
                            Utilities
                        </a>
                    </li>
                </ul>
            </li>
            <li class="left-menu-list-submenu">
                <a class="left-menu-link" href="javascript: void(0);">
                    <i class="left-menu-link-icon icmn-star-full"><!-- --></i>
                    Icons
                </a>
                <ul class="left-menu-list list-unstyled">
                    <li>
                        <a class="left-menu-link" href="icons-icomoon-ultimate.html">
                            IcoMoon Ultimate <span class="label left-menu-label label-default">59$ FREE</span>
                        </a>
                    </li>
                    <li>
                        <a class="left-menu-link" href="icons-fontawesome.html">
                            FontAwesome
                        </a>
                    </li>
                </ul>
            </li>
            <li>
                <a class="left-menu-link" href="layout-typography.html">
                    <i class="left-menu-link-icon icmn-font-size"><!-- --></i>
                    Typography
                </a>
            </li>
            <li class="left-menu-list-separator"><!-- --></li>
            <li class="left-menu-list-disabled">
                <a class="left-menu-link" href="javascript: void(0);">
                    Disabled Item
                </a>
            </li>
        </ul>
    </div>
</nav>