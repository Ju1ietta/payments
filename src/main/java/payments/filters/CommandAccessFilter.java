package payments.filters;

public class CommandAccessFilter {
    /**
     * LOG for this class.
     */
//    private static final Logger LOG = Logger.getLogger(CommandAccessFilter.class);
//
//    // commands access
//    private Map<String, List<String>> accessMap = new HashMap<String, List<String>>();
//    private List<String> commons = new ArrayList<String>();
//    private List<String> outOfControl = new ArrayList<String>();
//
//    public void destroy() {}
//
//    public void doFilter(ServletRequest request, ServletResponse response,
//                         FilterChain chain) throws IOException, ServletException {
//        LOG.debug("Filter starts");
//
//        if (accessAllowed(request)) {
//
//            LOG.debug("ALLOWED");
//
//            LOG.debug("Filter finished");
//            request.setAttribute("allowed", true);
//
//        } else {
//
//            LOG.debug("DENIED ");
//            String errorMessasge = "You do not have permission to access the requested resource";
//
//            HttpSession session = ((HttpServletRequest) request)
//                    .getSession(false);
//            if (session == null) {
//                session = ((HttpServletRequest) request).getSession();
//            }
//            session.setAttribute("errorMessage", errorMessasge);
//            LOG.trace("Set the session attribute: errorMessage --> "
//                    + errorMessasge);
//
//            request.setAttribute("allowed", false);
//        }
//        chain.doFilter(request, response);
//    }
//
//    private boolean accessAllowed(ServletRequest request) {
//        HttpServletRequest httpRequest = (HttpServletRequest) request;
//
//        String commandName = request.getParameter("command");
//
//        LOG.debug("In filter command = " + commandName);
//
//        if (commandName == null || commandName.isEmpty()) {
//            return false;
//        }
//
//        if (outOfControl.contains(commandName)) {
//            return true;
//        }
//
//        if (commandName.equals("logout")) {
//            return true;
//        }
//
//        HttpSession session = httpRequest.getSession(false);
//        if (session == null) {
//            return false;
//        }
//
//        // gets ClientBean from session
//        UserBean clientBean = (UserBean) session.getAttribute("userBean");
//        if (clientBean == null) {
//            return false;
//        }
//
//        String userRole = clientBean.getRole();
//        String accessRole = userRole;
//        if (userRole.equals(Constants.CLIENT)) {
//            String state = userRole.getState();
//            if (state.equals(Constants.STATE_LOCKED)) {
//                accessRole = Constants.CLIENT_LOCKED;
//            } else if (state.equals(Constants.STATE_UNLOCKED)) {
//                accessRole = Constants.CLIENT_UNLOCKED;
//            }
//        }
//
//        return accessMap.get(accessRole).contains(commandName)
//                || commons.contains(commandName);
//    }
//
//    public void init(FilterConfig fConfig) throws ServletException {
//        LOG.debug("Filter initialization starts");
//
//        // roles
//        accessMap.put(Constants.ADMIN,
//                asList(fConfig.getInitParameter(Constants.ADMIN)));
//        accessMap.put(Constants.CLIENT_UNLOCKED,
//                asList(fConfig.getInitParameter(Constants.CLIENT_UNLOCKED)));
//        accessMap.put(Constants.CLIENT_LOCKED,
//                asList(fConfig.getInitParameter(Constants.CLIENT_LOCKED)));
//        LOG.trace("Access map --> " + accessMap);
//
//        // commons
//        commons = asList(fConfig.getInitParameter("common"));
//        LOG.trace("Common commands --> " + commons);
//
//        // out of control
//        outOfControl = asList(fConfig.getInitParameter("out-of-control"));
//        LOG.trace("Out of control commands --> " + outOfControl);
//
//        LOG.debug("Filter initialization finished");
//    }
//
//    /**
//     * Extracts parameter values from string.
//     *
//     * @param str parameter values string.
//     * @return list of parameter values.
//     */
//    private List<String> asList(String str) {
//        List<String> list = new ArrayList<String>();
//        StringTokenizer st = new StringTokenizer(str);
//        while (st.hasMoreTokens()) {
//            list.add(st.nextToken());
//        }
//        return list;
//    }

}